# Json2Avro
This is a fork of andeb's Extended json converter from https://github.com/andeb/avro-json-decoder, using gradle and
apacha 1.10. 


This converter can infer default value from the schema when they are not present in the json, thus resulting in a 
more bullet proof convertor.

This feature is necessary regarding schema evolution 
when a schema is written in a database with multiple sercices using it with each having their own schema version.

