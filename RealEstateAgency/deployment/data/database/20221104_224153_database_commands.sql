ALTER TABLE "myfirstmodule$appointment" ADD "client_phone" VARCHAR_IGNORECASE(200) NULL;
ALTER TABLE "myfirstmodule$appointment" ADD "client_name" VARCHAR_IGNORECASE(200) NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('0020edcf-f256-4363-9bc0-09d87b7443cb', 
'cad80525-f0b7-428e-9721-bb269d4b2f37', 
'client_phone', 
'client_phone', 
30, 
200, 
'', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('840148a4-83ef-49e4-86fe-aadbcd9ea068', 
'cad80525-f0b7-428e-9721-bb269d4b2f37', 
'client_name', 
'client_name', 
30, 
200, 
'', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20221104 22:41:53';
