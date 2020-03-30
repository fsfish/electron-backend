import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';
import { JhiLanguageService } from 'ng-jhipster';
import { JhiLanguageHelper } from 'app/core';

import { PgkernelgatewaySharedModule } from 'app/shared';
import {
  PgApplicationServiceComponent,
  PgApplicationServiceDetailComponent,
  PgApplicationServiceUpdateComponent,
  PgApplicationServiceDeletePopupComponent,
  PgApplicationServiceDeleteDialogComponent,
  pgApplicationServiceRoute,
  pgApplicationServicePopupRoute
} from './';

const ENTITY_STATES = [...pgApplicationServiceRoute, ...pgApplicationServicePopupRoute];

@NgModule({
  imports: [PgkernelgatewaySharedModule, RouterModule.forChild(ENTITY_STATES)],
  declarations: [
    PgApplicationServiceComponent,
    PgApplicationServiceDetailComponent,
    PgApplicationServiceUpdateComponent,
    PgApplicationServiceDeleteDialogComponent,
    PgApplicationServiceDeletePopupComponent
  ],
  entryComponents: [
    PgApplicationServiceComponent,
    PgApplicationServiceUpdateComponent,
    PgApplicationServiceDeleteDialogComponent,
    PgApplicationServiceDeletePopupComponent
  ],
  providers: [{ provide: JhiLanguageService, useClass: JhiLanguageService }],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class PgkernelgatewayPgApplicationServiceModule {
  constructor(private languageService: JhiLanguageService, private languageHelper: JhiLanguageHelper) {
    this.languageHelper.language.subscribe((languageKey: string) => {
      if (languageKey !== undefined) {
        this.languageService.changeLanguage(languageKey);
      }
    });
  }
}
