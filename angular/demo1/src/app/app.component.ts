import { Component, OnInit } from '@angular/core';
import { FormGroup, FormArray, FormBuilder, Validators } from '@angular/forms';
import { ModelData } from './data.model';
import * as _ from 'lodash';  



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  books =["1","2","3","4"];
//   public myForm: FormGroup;
//   public myForm1: FormGroup;
//   uniqueList: Array<any>=[];
//   data: ModelData; 
//   dataArray: Array<ModelData>=[];
// uniqueCode :Array<string> =[];
//   constructor(private _fb: FormBuilder
//  ) { }

//   data2: Array<any>=[
//     {'id':1, 'name': 'kapil' },
//     {'id':2, 'name': 'kapil1' },
//     {'id':13, 'name': 'kapil' },
//     {'id':4, 'name': 'kapil3' }]
conditions1= false;
  ngOnInit() {
    // this.myForm = this._fb.group({
    //   measureCode: [''],
    //   measureName: [''],
    //   grade: [''],
    //   markingPeriod: [''],
    //   ell: [''],
    // });
    // this.myForm1 = this._fb.group({
    //   measureCode: [''],
    //   measureName: [''],
    //   fromValue: [''],
    //   toValue: [''],
    //   grade: [''],
    //   ell: [''],
    // });
  }
  fun(){
    this.conditions1 = !this.conditions1;
    console.log(this.conditions1)
  }
//   update(formdate) {
//     if(formdate.valid){
//       this.data = new ModelData();
//       this.dataArray = this.dataArray.filter(obj => {
//         if( obj.measureName === formdate.value.measureName && obj.measureCode === formdate.value.measureCode ){
//           if( obj.grade === formdate.value.grade && obj.ell === formdate.value.ell ){
//             return false;
//           }
//           else{
//             return true;
//           }
//           }
//           else if(obj.measureName === formdate.value.measureName || obj.measureCode === formdate.value.measureCode ){
//             return false;
//           }
//           else{
//             return true;
//           }
//       }

//       );
//       this.data.grade = formdate.value.grade;
//       this.data.measureName = formdate.value.measureName;
//       this.data.measureCode = formdate.value.measureCode;
//       this.data.markingPeriod = formdate.value.markingPeriod;
//       this.data.ell = formdate.value.ell;
//       this.dataArray.push(this.data);
//  this.updatelist(); 
//     }
//   }
//   del(index :number){
//     this.dataArray.splice(index,1);
//   }
//   updatelist(){
//   //return this.http.get('https://www.surveygizmo.com/').

//   }
//   add(){
//     // this.uniqueList = [];
//     // this.data2.forEach(e => {
//     //   if (!this.uniqueList.includes(e)){
//     //     this.uniqueList.push(e);
//     //   }
//     // })
//     // console.log(this.data2);
//     // console.log('unique list', this.data2);

//  console.log( _.uniqBy(this.data2,'id'));
//   }
}
