ALTER TABLE "myfirstmodule$agent" ALTER COLUMN "municipality" SET DATA TYPE VARCHAR_IGNORECASE(14);
UPDATE "mendixsystem$attribute"
 SET "entity_id" = '006bb399-149e-4bf6-9edc-1c32e90f3ccf', 
"attribute_name" = 'municipality', 
"column_name" = 'municipality', 
"type" = 40, 
"length" = 14, 
"default_value" = '', 
"is_auto_number" = false
 WHERE "id" = 'c0c20379-0fd7-4d68-9919-5f6378dc03d0';
ALTER TABLE "myfirstmodule$advertisement" ALTER COLUMN "municipality" SET DATA TYPE VARCHAR_IGNORECASE(14);
UPDATE "mendixsystem$attribute"
 SET "entity_id" = '5788b3dc-7439-448d-b252-b4a3e59f6397', 
"attribute_name" = 'municipality', 
"column_name" = 'municipality', 
"type" = 40, 
"length" = 14, 
"default_value" = '', 
"is_auto_number" = false
 WHERE "id" = 'a2c6b6b9-5e8e-4b52-8134-6a1c752ad826';
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20221124 20:12:31';
