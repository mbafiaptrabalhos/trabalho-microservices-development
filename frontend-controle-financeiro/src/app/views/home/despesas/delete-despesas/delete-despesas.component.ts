import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { DespesasService } from '../despesas.service';
import { Despesa } from '../user.model';


@Component({
  selector: 'app-delete-despesas',
  templateUrl: './delete-despesas.component.html',
  styleUrls: ['./delete-despesas.component.css']
})
export class DeleteDespesasComponent implements OnInit {

  despesa!: Despesa;
  response!: string;
  
  constructor(private despesasService: DespesasService, private route: ActivatedRoute) { }

  ngOnInit() {
     this.despesasService.getDespesa("1").subscribe(res => {
      this.despesa = res.data;
     });
   }
 
   delete(){
     this.despesasService.deleteDespesa("1").subscribe(res => {
       debugger;
        this.response = "ok";
     })
   }
 
}
