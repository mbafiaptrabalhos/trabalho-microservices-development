import { Component, OnInit } from '@angular/core';
import { DespesasService } from '../despesas.service';
import { RequestCreate, ResponseCreate } from '../user.model';

@Component({
  selector: 'app-create-despesas',
  templateUrl: './create-despesas.component.html',
  styleUrls: ['./create-despesas.component.css']
})
export class CreateDespesasComponent implements OnInit {

  request: RequestCreate ={
    name: '', 
    job: ''
  }

  response!: ResponseCreate;

  constructor(private despesasService: DespesasService ) { }

  ngOnInit() {

  }

  save(){
    this.despesasService.createDespesas(this.request).subscribe(res => {
      this.response = res;
    });
  }

}
