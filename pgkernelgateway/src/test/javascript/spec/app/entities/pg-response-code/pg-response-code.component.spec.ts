/* tslint:disable max-line-length */
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { Observable, of } from 'rxjs';
import { HttpHeaders, HttpResponse } from '@angular/common/http';

import { PgkernelgatewayTestModule } from '../../../test.module';
import { PgResponseCodeComponent } from 'app/entities/pg-response-code/pg-response-code.component';
import { PgResponseCodeService } from 'app/entities/pg-response-code/pg-response-code.service';
import { PgResponseCode } from 'app/shared/model/pg-response-code.model';

describe('Component Tests', () => {
  describe('PgResponseCode Management Component', () => {
    let comp: PgResponseCodeComponent;
    let fixture: ComponentFixture<PgResponseCodeComponent>;
    let service: PgResponseCodeService;

    beforeEach(() => {
      TestBed.configureTestingModule({
        imports: [PgkernelgatewayTestModule],
        declarations: [PgResponseCodeComponent],
        providers: []
      })
        .overrideTemplate(PgResponseCodeComponent, '')
        .compileComponents();

      fixture = TestBed.createComponent(PgResponseCodeComponent);
      comp = fixture.componentInstance;
      service = fixture.debugElement.injector.get(PgResponseCodeService);
    });

    it('Should call load all on init', () => {
      // GIVEN
      const headers = new HttpHeaders().append('link', 'link;link');
      spyOn(service, 'query').and.returnValue(
        of(
          new HttpResponse({
            body: [new PgResponseCode(123)],
            headers
          })
        )
      );

      // WHEN
      comp.ngOnInit();

      // THEN
      expect(service.query).toHaveBeenCalled();
      expect(comp.pgResponseCodes[0]).toEqual(jasmine.objectContaining({ id: 123 }));
    });
  });
});
