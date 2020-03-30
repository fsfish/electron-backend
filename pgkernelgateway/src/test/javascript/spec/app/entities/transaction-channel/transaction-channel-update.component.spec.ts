/* tslint:disable max-line-length */
import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { HttpResponse } from '@angular/common/http';
import { FormBuilder } from '@angular/forms';
import { Observable, of } from 'rxjs';

import { PgkernelgatewayTestModule } from '../../../test.module';
import { TransactionChannelUpdateComponent } from 'app/entities/transaction-channel/transaction-channel-update.component';
import { TransactionChannelService } from 'app/entities/transaction-channel/transaction-channel.service';
import { TransactionChannel } from 'app/shared/model/transaction-channel.model';

describe('Component Tests', () => {
  describe('TransactionChannel Management Update Component', () => {
    let comp: TransactionChannelUpdateComponent;
    let fixture: ComponentFixture<TransactionChannelUpdateComponent>;
    let service: TransactionChannelService;

    beforeEach(() => {
      TestBed.configureTestingModule({
        imports: [PgkernelgatewayTestModule],
        declarations: [TransactionChannelUpdateComponent],
        providers: [FormBuilder]
      })
        .overrideTemplate(TransactionChannelUpdateComponent, '')
        .compileComponents();

      fixture = TestBed.createComponent(TransactionChannelUpdateComponent);
      comp = fixture.componentInstance;
      service = fixture.debugElement.injector.get(TransactionChannelService);
    });

    describe('save', () => {
      it('Should call update service on save for existing entity', fakeAsync(() => {
        // GIVEN
        const entity = new TransactionChannel(123);
        spyOn(service, 'update').and.returnValue(of(new HttpResponse({ body: entity })));
        comp.updateForm(entity);
        // WHEN
        comp.save();
        tick(); // simulate async

        // THEN
        expect(service.update).toHaveBeenCalledWith(entity);
        expect(comp.isSaving).toEqual(false);
      }));

      it('Should call create service on save for new entity', fakeAsync(() => {
        // GIVEN
        const entity = new TransactionChannel();
        spyOn(service, 'create').and.returnValue(of(new HttpResponse({ body: entity })));
        comp.updateForm(entity);
        // WHEN
        comp.save();
        tick(); // simulate async

        // THEN
        expect(service.create).toHaveBeenCalledWith(entity);
        expect(comp.isSaving).toEqual(false);
      }));
    });
  });
});
