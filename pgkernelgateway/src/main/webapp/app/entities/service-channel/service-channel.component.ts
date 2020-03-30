import { Component, OnInit, OnDestroy } from '@angular/core';
import { HttpErrorResponse, HttpResponse } from '@angular/common/http';
import { Subscription } from 'rxjs';
import { filter, map } from 'rxjs/operators';
import { JhiEventManager, JhiAlertService } from 'ng-jhipster';

import { IServiceChannel } from 'app/shared/model/service-channel.model';
import { AccountService } from 'app/core';
import { ServiceChannelService } from './service-channel.service';

@Component({
  selector: 'jhi-service-channel',
  templateUrl: './service-channel.component.html'
})
export class ServiceChannelComponent implements OnInit, OnDestroy {
  serviceChannels: IServiceChannel[];
  currentAccount: any;
  eventSubscriber: Subscription;

  constructor(
    protected serviceChannelService: ServiceChannelService,
    protected jhiAlertService: JhiAlertService,
    protected eventManager: JhiEventManager,
    protected accountService: AccountService
  ) {}

  loadAll() {
    this.serviceChannelService
      .query()
      .pipe(
        filter((res: HttpResponse<IServiceChannel[]>) => res.ok),
        map((res: HttpResponse<IServiceChannel[]>) => res.body)
      )
      .subscribe(
        (res: IServiceChannel[]) => {
          this.serviceChannels = res;
        },
        (res: HttpErrorResponse) => this.onError(res.message)
      );
  }

  ngOnInit() {
    this.loadAll();
    this.accountService.identity().then(account => {
      this.currentAccount = account;
    });
    this.registerChangeInServiceChannels();
  }

  ngOnDestroy() {
    this.eventManager.destroy(this.eventSubscriber);
  }

  trackId(index: number, item: IServiceChannel) {
    return item.id;
  }

  registerChangeInServiceChannels() {
    this.eventSubscriber = this.eventManager.subscribe('serviceChannelListModification', response => this.loadAll());
  }

  protected onError(errorMessage: string) {
    this.jhiAlertService.error(errorMessage, null, null);
  }
}
