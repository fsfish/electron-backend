export interface IPersonType {
  id?: number;
  code?: string;
  label?: string;
  active?: boolean;
}

export class PersonType implements IPersonType {
  constructor(public id?: number, public code?: string, public label?: string, public active?: boolean) {
    this.active = this.active || false;
  }
}
