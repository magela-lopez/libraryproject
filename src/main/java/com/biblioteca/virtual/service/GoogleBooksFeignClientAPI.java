package com.biblioteca.virtual.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "google-books", url = "https://www.googleapis.com/books/v1")
public interface GoogleBooksFeignClientAPI {

    @GetMapping("/volumes")
    String getBooks(@RequestParam("q") String query);

}


/*La url base de la API de Google Books para hacer una consulta por ISBN es «https://www.googleapis.com/books/v1/volumes?q=isbn:»,
esta dirección irá seguida del número ISBN que queramos consultar. Vemos que el parámetro que le estamos pasando a la url se llama isbn, pero no es esta la única opción de búsqueda que permite la interfaz. Además del ISBN, tenemos todas las siguientes alternativas para poder hacer búsquedas de las formas que nos resulten más convenientes: • intitle: Búsqueda por título. • inauthor: Búsqueda por autor. • inpublisher: Búsqueda por editorial. • subject: Búsqueda por género. • isbn: Búsqueda por número de ISBN. • lccn: Búsqueda por número de control de la Biblioteca del Congreso de los Estados Unidos. • oclc: Búsqueda por número del Online Computer Library Center. ~ © Javier Esteban González Andújar @finalescerrados https://www.finalescerrados.com/2020/08/como-extraer-informacion-de-google-books.html*/