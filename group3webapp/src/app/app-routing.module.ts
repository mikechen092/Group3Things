import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {CandylistComponent} from './components/candylist/candylist.component';
import {RecipesubmissionComponent} from './components/recipesubmission/recipesubmission.component';


const routes: Routes=[
    {path:'candylist', component:CandylistComponent},
    {path: 'recipesubmission', component:RecipesubmissionComponent}
];

@NgModule({
    imports:[RouterModule.forRoot(routes)],
    exports: [RouterModule]
})

export class AppRoutingModule{}
export const routingComponents= [CandylistComponent,RecipesubmissionComponent];
