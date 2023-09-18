# Trabalhando com Datas

## Date: 

> Pacote: java.util
- Representa um **INSTANTE**

[Link com o material de apoio](https://dosc.oracle.com/javase/10/docs/api/java/util/Date.html)
### Um objeto Date internamente armazena:
O número de milissegundos desde a meia noite do dia 1 de Janeiro de 1970 GMT (UTC)
- GMT: Greenwich Mean Time (time zone)
- UTC> Coordinated Universal Time (time standard)

## SimpleDateFormat
[Link com o material de apoio](https://docs.oracle.com/javase/10/docs/api/java/text/SimpleDateFormat.html)
### Define Formatos para conversão entre Date e String:
 
- dd/MM/yyyy -> 29/07/2020
- dd/MM/yyyy HH:mm:ss -> 29/07/2020 16:42:21

## Padrão ISO 8601 e classe Instant
 
- Formato: yyyy-MM-ddTHH:mm:ssZ
- Exemplo: "2020-07-29T16:42:21Z"
> Date y3 = Date.from(Instant.parse("2020-07-29T16:42:21Z"));# date-hour-manipulation
