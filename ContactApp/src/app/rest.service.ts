import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { map, catchError, tap } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})

export class RestService {

  constructor(private http: HttpClient) {
   }
    endpoint = "http://localhost:8080/";
    httpOptions = {
     headers: new HttpHeaders({
       'Content-Type':  'application/json'
     })
   };
   private extractData(res: Response) {
    let body = res;
    return body || { };
  }

  getPersons(): Observable<any> {
    return this.http.get(this.endpoint + 'Person/' ).pipe(
      map(this.extractData));
  }
  
getPerson(id): Observable<any> {
  return this.http.get(this.endpoint + 'Person/' + id).pipe(
    map(this.extractData));
}

addPersons (product): Observable<any> {
  console.log(product);
  return this.http.post<any>(this.endpoint + 'Person', JSON.stringify(product), this.httpOptions).pipe(
    tap((product) => console.log(`added Person w/ id=${product.id}`)),
    catchError(this.handleError<any>('addPerson'))
  );
}

updatePerson (id, product): Observable<any> {
  return this.http.put(this.endpoint + 'Person/' + id, JSON.stringify(product), this.httpOptions).pipe(
    tap(_ => console.log(`updated Person id=${id}`)),
    catchError(this.handleError<any>('updatePerson'))
  );
}

deletePerson (id): Observable<any> {
  return this.http.delete<any>(this.endpoint + 'Person/' + id, this.httpOptions).pipe(
    tap(_ => console.log(`deleted Person id=${id}`)),
    catchError(this.handleError<any>('deletePerson'))
  );
}
  private handleError<T> (operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {
  
      // TODO: send the error to remote logging infrastructure
      console.error(error); // log to console instead
  
      // TODO: better job of transforming error for user consumption
      console.log(`${operation} failed: ${error.message}`);
  
      // Let the app keep running by returning an empty result.
      return of(result as T);
    };
  }








  getCompanies(): Observable<any> {
    return this.http.get(this.endpoint + 'Company/' ).pipe(
      map(this.extractData));
  }
  
getCompany(id): Observable<any> {
  return this.http.get(this.endpoint + 'Company/' + id).pipe(
    map(this.extractData));
}

addCompanies (product): Observable<any> {
  console.log(product);
  return this.http.post<any>(this.endpoint + 'Company', JSON.stringify(product), this.httpOptions).pipe(
    tap((product) => console.log(`added Company w/ id=${product.id}`)),
    catchError(this.handleError<any>('addCompany'))
  );
}

updateCompany (id, product): Observable<any> {
  return this.http.put(this.endpoint + 'Company/' + id, JSON.stringify(product), this.httpOptions).pipe(
    tap(_ => console.log(`updated Company id=${id}`)),
    catchError(this.handleError<any>('updateCompany'))
  );
}

deleteCompany (id): Observable<any> {
  return this.http.delete<any>(this.endpoint + 'Company/' + id, this.httpOptions).pipe(
    tap(_ => console.log(`deleted Company id=${id}`)),
    catchError(this.handleError<any>('deleteCompany'))
  );
}
}
