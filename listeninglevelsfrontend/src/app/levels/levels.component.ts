import { Component } from '@angular/core';
import { Levels } from '../levels';
import { LevelsService } from '../levels.service';

@Component({
  selector: 'app-levels',
  templateUrl: './levels.component.html',
  styleUrls: ['./levels.component.css']
})
export class LevelsComponent {
  levels: Levels[];
  userName: string;
  level: Levels;

  constructor( private levelsService: LevelsService) {
    this.level = new Levels();
  }

  levelInternal() {
    this.level.userName = this.userName;
    this.level.level = "Internal";
    this.levelsService.save(this.level).subscribe( result => this.fetchHistory() );
  }

  levelFocused() {
    this.level.userName = this.userName;
    this.level.level = "Focused";
    this.levelsService.save(this.level).subscribe(result => this.fetchHistory() );
  }

  levelGlobal() {
    this.level.userName = this.userName;
    this.level.level = "Global";
    this.levelsService.save(this.level).subscribe(result => this.fetchHistory() );
  }

  fetchHistory() {
    this.levelsService.getHistory(this.userName).subscribe(
      data => {
        this.levels = data;
      }
    );
  }

  delete(id: number){
    this.levelsService.delete(id).subscribe(result => this.fetchHistory() );
  }
}