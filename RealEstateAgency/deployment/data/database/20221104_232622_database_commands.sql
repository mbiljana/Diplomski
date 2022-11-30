ALTER TABLE "myfirstmodule$appointment" ADD "address" VARCHAR_IGNORECASE(200) NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('808e12d6-2a9d-49a8-9fb9-17ff2264170c', 
'cad80525-f0b7-428e-9721-bb269d4b2f37', 
'address', 
'address', 
30, 
200, 
'', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20221104 23:26:22';
