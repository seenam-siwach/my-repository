import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Levels } from './levels';

@Injectable({
  providedIn: 'root'
})
export class LevelsService {
  private url: string;

  constructor(private httpClient: HttpClient) {
    this.url = "http://localhost:8080/levels";
  }

  public findAll(): Observable<Levels[]> {
    return this.httpClient.get<Levels[]>( this.url );
  }

  // getHistory - for a specific user
  // save - to add for a user
  // delete - to delete an entry

  // localhost:8080/levels/userName
  public getHistory( userName: string ): Observable<Levels[]> {
    return this.httpClient.get<Levels[]>(this.url + '/' + userName);
  }

  public save(level: Levels){
    return this.httpClient.post<Levels>(this.url, level);
  }

  public delete(id: number){
    return this.httpClient.delete(this.url + "/"+ id);
  }
}
