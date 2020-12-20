import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { DespesasService } from '../despesas.service';
import { RequestCreate } from '../user.model';

@Component({
  selector: 'app-update-despesas',
  templateUrl: './update-despesas.component.html',
  styleUrls: ['./update-despesas.component.css']
})
export class UpdateDespesasComponent implements OnInit {

  id!: string;

  request!: RequestCreate;

  response!: string;
  
  constructor(private despesasService: DespesasService, private route: ActivatedRoute) { }

  ngOnInit() {
    this.despesasService.getDespesa("1").subscribe(res => {
      debugger;
      this.request = {
        name: res.data.first_name,
        job: ''
      }
    });
  }

  update(){ 
    this.despesasService.updateDespesas("1", this.request).subscribe(res => {
      this.response = "ok"; 
    })
  }
}
