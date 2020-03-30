/* tslint:disable max-line-length */
import { ComponentFixture, TestBed, inject, fakeAsync, tick } from '@angular/core/testing';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';
import { Observable, of } from 'rxjs';
import { JhiEventManager } from 'ng-jhipster';

import { PgkernelgatewayTestModule } from '../../../test.module';
import { PgResponseCodeDeleteDialogComponent } from 'app/entities/pg-response-code/pg-response-code-delete-dialog.component';
import { PgResponseCodeService } from 'app/entities/pg-response-code/pg-response-code.service';

describe('Component Tests', () => {
  describe('PgResponseCode Management Delete Component', () => {
    let comp: PgResponseCodeDeleteDialogComponent;
    let fixture: ComponentFixture<PgResponseCodeDeleteDialogComponent>;
    let service: PgResponseCodeService;
    let mockEventManager: any;
    let mockActiveModal: any;

    beforeEach(() => {
      TestBed.configureTestingModule({
        imports: [PgkernelgatewayTestModule],
        declarations: [PgResponseCodeDeleteDialogComponent]
      })
        .overrideTemplate(PgResponseCodeDeleteDialogComponent, '')
        .compileComponents();
      fixture = TestBed.createComponent(PgResponseCodeDeleteDialogComponent);
      comp = fixture.componentInstance;
      service = fixture.debugElement.injector.get(PgResponseCodeService);
      mockEventManager = fixture.debugElement.injector.get(JhiEventManager);
      mockActiveModal = fixture.debugElement.injector.get(NgbActiveModal);
    });

    describe('confirmDelete', () => {
      it('Should call delete service on confirmDelete', inject(
        [],
        fakeAsync(() => {
          // GIVEN
          spyOn(service, 'delete').and.returnValue(of({}));

          // WHEN
          comp.confirmDelete(123);
          tick();

          // THEN
          expect(service.delete).toHaveBeenCalledWith(123);
          expect(mockActiveModal.dismissSpy).toHaveBeenCalled();
          expect(mockEventManager.broadcastSpy).toHaveBeenCalled();
        })
      ));
    });
  });
});
