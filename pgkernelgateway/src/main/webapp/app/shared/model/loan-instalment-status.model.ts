export interface ILoanInstalmentStatus {
  id?: number;
  code?: string;
  label?: string;
  active?: boolean;
}

export class LoanInstalmentStatus implements ILoanInstalmentStatus {
  constructor(public id?: number, public code?: string, public label?: string, public active?: boolean) {
    this.active = this.active || false;
  }
}
