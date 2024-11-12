package br.com.hq.rickmatch.service;

public interface IconverteDados {
   <T> T obterDados(String json, Class<T> classe);
}
