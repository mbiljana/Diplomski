DROP INDEX "idx_myfirstmodule$review_advertisement_myfirstmodule$agent_myfirstmodule$advertisement";
ALTER TABLE "myfirstmodule$review_advertisement" RENAME TO "97febebec529414ea703b13f8df9d8f3";
ALTER TABLE "myfirstmodule$appointment_agent" DROP CONSTRAINT "uniq_myfirstmodule$appointment_agent_myfirstmodule$appointmentid";
DROP INDEX "idx_myfirstmodule$appointment_agent_myfirstmodule$agent_myfirstmodule$appointment";
ALTER TABLE "myfirstmodule$appointment_agent" RENAME TO "8b740ebcb26c4a3fb76fffe97c73e16d";
DELETE FROM "mendixsystem$association" 
 WHERE "id" = '1bee22dc-a29d-4849-8a43-ad6cfa5d81dd';
DELETE FROM "mendixsystem$association" 
 WHERE "id" = '6e3417dc-9ed6-4603-bc32-b1220de42194';
DELETE FROM "mendixsystem$unique_constraint" 
 WHERE "name" = 'uniq_myfirstmodule$appointment_agent_myfirstmodule$appointmentid';
CREATE TABLE "myfirstmodule$review_advertisement" (
	"myfirstmodule$advertisementid" BIGINT NOT NULL,
	"myfirstmodule$agentid" BIGINT NOT NULL,
	PRIMARY KEY("myfirstmodule$advertisementid","myfirstmodule$agentid"),
	CONSTRAINT "uniq_myfirstmodule$review_advertisement_myfirstmodule$advertisementid" UNIQUE ("myfirstmodule$advertisementid"));
CREATE INDEX "idx_myfirstmodule$review_advertisement_myfirstmodule$agent_myfirstmodule$advertisement" ON "myfirstmodule$review_advertisement" ("myfirstmodule$agentid" ASC,"myfirstmodule$advertisementid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('d4b442fc-09d9-4f39-8220-6ccecd7f50c1', 
'MyFirstModule.Review_Advertisement', 
'myfirstmodule$review_advertisement', 
'5788b3dc-7439-448d-b252-b4a3e59f6397', 
'006bb399-149e-4bf6-9edc-1c32e90f3ccf', 
'myfirstmodule$advertisementid', 
'myfirstmodule$agentid', 
'idx_myfirstmodule$review_advertisement_myfirstmodule$agent_myfirstmodule$advertisement');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_myfirstmodule$review_advertisement_myfirstmodule$advertisementid', 
'd4b442fc-09d9-4f39-8220-6ccecd7f50c1', 
'b3618f63-fa12-33d2-9f5d-ffadc724297b');
DROP TABLE "97febebec529414ea703b13f8df9d8f3";
DROP TABLE "8b740ebcb26c4a3fb76fffe97c73e16d";
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20221104 22:21:15';
