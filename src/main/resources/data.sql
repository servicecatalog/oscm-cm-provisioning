INSERT INTO instance (id, instance_id, organization_id, organization_name, subscription_id, reference_id, controller_id, provisioning_status, provisioning_msg, request_time )
VALUES (1, 'Instance_1433435333', '24tr1q3w', 'Supplier org', 'Sub_986453', 'ref856387482', 'ess.openstack', 'WAITING_FOR_SYSTEM_CREATION', 'Instance has been requested to be provisioned', '2018-09-11 11:00:54');

INSERT INTO instance (id, instance_id, organization_id, organization_name, subscription_id, reference_id, controller_id, provisioning_status, provisioning_msg, request_time )
VALUES (2, 'Instance_5355662567', '24tr1q3w', 'Supplier org', 'Sub_761113', 'ref743753333', 'ess.openstack', 'WAITING_FOR_SYSTEM_CREATION', 'Instance has been requested to be provisioned', '2018-09-10 16:21:54');

INSERT INTO instance (id, instance_id, organization_id, organization_name, subscription_id, reference_id, controller_id, provisioning_status, provisioning_msg, request_time )
VALUES (3, 'Instance_5644436888', 'rg563ebc', 'Tech_supplier', 'Sub_124535', 'ref765356789', 'ess.azure', 'WAITING_FOR_SYSTEM_CREATION', 'Instance has been requested to be provisioned', '2018-09-09 12:17:12');

INSERT INTO instance (id, instance_id, organization_id, organization_name, subscription_id, reference_id, controller_id, provisioning_status, provisioning_msg, request_time )
VALUES (4, 'Instance_8972222311', 'rg563ebc', 'Tech_supplier', 'Sub_777886', 'ref127777900', 'ess.aws', 'WAITING_FOR_SYSTEM_CREATION', 'Instance has been requested to be provisioned', '2018-09-10 09:44:41');

INSERT INTO instance (id, instance_id, organization_id, organization_name, subscription_id, reference_id, controller_id, provisioning_status, provisioning_msg, request_time )
VALUES (5, 'Instance_1766654234', 'rg563ebc', 'Tech_supplier', 'Sub_234456', 'ref126645678', 'ess.aws', 'WAITING_FOR_SYSTEM_CREATION', 'Instance has been requested to be provisioned', '2018-09-11 07:11:21');

INSERT INTO instance (id, instance_id, organization_id, organization_name, subscription_id, reference_id, controller_id, provisioning_status, provisioning_msg, request_time )
VALUES (6, 'Instance_1115643566', 'rg563ebc', 'Tech_supplier', 'Sub_711367', 'ref985654311', 'ess.vmware', 'WAITING_FOR_SYSTEM_CREATION', 'Instance has been requested to be provisioned', '2018-09-10 11:09:56');

INSERT INTO instance (id, instance_id, organization_id, organization_name, subscription_id, reference_id, controller_id, provisioning_status, provisioning_msg, request_time )
VALUES (7, 'Instance_9834563445', 'rg563ebc', 'Tech_supplier', 'Sub_744130', 'ref54222', 'ess.azure', 'WAITING_FOR_SYSTEM_CREATION', 'Instance has been requested to be provisioned', '2018-09-10 15:09:26');

INSERT INTO instance (id, instance_id, organization_id, organization_name, subscription_id, reference_id, controller_id, provisioning_status, provisioning_msg, request_time )
VALUES (8, 'Instance_4322211355', '24tr1q3w', 'Supplier org', 'Sub_553217', 'ref86577', 'ess.openstack', 'WAITING_FOR_SYSTEM_CREATION', 'Instance has been requested to be provisioned', '2018-09-10 18:01:16');

INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (1,'TENANT_ID', '42eewff33esgsdfaad',1);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (2,'TP_IMAGEID', 'cedarish',1);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (3,'TP_FLAVOuR', 'm1.small',1);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (4,'TP_AZ', 'nova',1);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (5,'TP_VMNAME', 'VM-os1234434322',1);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (6,'TP_KEYNAME', 'openstackkeypair',1);

INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (7,'TENANT_ID', '3445edfdfff4f4ff4f',2);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (8,'TP_IMAGEID', 'cedarish',2);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (9,'TP_FLAVOuR', 'm1.medium',2);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (10,'TP_AZ', 'cinder',2);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (11,'TP_VMNAME', 'VM-433dsdfdsf33',2);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (12,'TP_KEYNAME', 'openstackkeypair',2);

INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (13,'INSTANCENAME', '3445edfdfff4f4ff4f',4);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (14,'INSTANCENAME_PREFIX', 'aws',4);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (15,'KEY_PAIR_NAME', 'abc:123',4);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (16,'IMAGE_NAME', 'ami-0d77397e',4);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (17,'INSTANCE_TYPE', 't2.micro',4);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (18,'REGION', 'us-west-1',4);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (19,'DISK_SIZE', '3',4);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (20,'PUBLIC_IP', '10.10.0.1',4);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (21,'SUBNET', 'subnet-a77430d0',4);

INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (22,'AMOUNT_OF_RAM', '4 GB',6);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (23,'DISK_SIZE', '100',6);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (24,'IMPORT_EXISTING_VM', 'false',6);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (25,'INSTANCENAME', 'vmware1313131',6);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (26,'DOMAIN_NAME', 'private',6);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (27,'NIC1_NETWORK_SETTINGS', 'DHCP',6);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (28,'NUMBER_OF_NICS', '1',6);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (29,'TEMPLATENAME', 'SUSE 11',6);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (30,'TARGET_CLUSTER', 'esscluster',6);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (31,'TARGET_DATACENTER', 'EST',6);

INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (32,'REGION', 'eu',7);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (33,'CLIENT_SECRET', 'admin123',7);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (34,'STORAGE_ACCOUNT', 'ac13122',7);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (35,'VM_NAME', 'azure78-099932',7);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (36,'TEMPLATE_PARAMETERS_NAME', 'params.xml',7);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (37,'SUBNET', '192.168.1.11',7);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (38,'RESOURCE_GROUP_NAME', 'res1234',7);

INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (39,'REGION', 'us',3);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (40,'CLIENT_SECRET', 'qwerty123456',3);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (41,'STORAGE_ACCOUNT', 'ac3333',3);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (42,'VM_NAME', 'azure21-9999',3);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (43,'TEMPLATE_PARAMETERS_NAME', 'params.xml',3);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (44,'SUBNET', '192.168.18.101',3);
INSERT INTO instance_parameter(id, key, value, instance_id) VALUES (45,'RESOURCE_GROUP_NAME', 'res3334',3);

INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (1,'ATT_1', 'val1',1);
INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (2,'ATT_2', 'val2',1);
INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (3,'ATT_3', 'val3',1);
INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (4,'ATT_4', 'val4',1);
INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (5,'ATT_5', 'val5',1);

INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (6,'ATT_1', 'val1',2);
INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (7,'ATT_2', 'val2',2);
INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (8,'ATT_3', 'val3',2);
INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (9,'ATT_4', 'val4',2);
INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (10,'ATT_5', 'val5',2);

INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (11,'ATT_1', 'val1',3);
INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (12,'ATT_2', 'val2',3);
INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (13,'ATT_3', 'val3',3);
INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (14,'ATT_4', 'val4',3);
INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (15,'ATT_5', 'val5',3);

INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (16,'ATT_1', 'val1',4);
INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (17,'ATT_2', 'val2',4);
INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (18,'ATT_3', 'val3',4);
INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (19,'ATT_4', 'val4',4);
INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (20,'ATT_5', 'val5',4);

INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (21,'ATT_1', 'val1',5);
INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (22,'ATT_2', 'val2',5);
INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (23,'ATT_3', 'val3',5);
INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (24,'ATT_4', 'val4',5);
INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (25,'ATT_5', 'val5',5);

INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (26,'ATT_1', 'val1',6);
INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (27,'ATT_2', 'val2',6);
INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (28,'ATT_3', 'val3',6);
INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (29,'ATT_4', 'val4',6);
INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (30,'ATT_5', 'val5',6);

INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (31,'ATT_1', 'val1',7);
INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (32,'ATT_2', 'val2',7);
INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (33,'ATT_3', 'val3',7);
INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (34,'ATT_4', 'val4',7);
INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (35,'ATT_5', 'val5',7);

INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (36,'ATT_1', 'val1',8);
INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (37,'ATT_2', 'val2',8);
INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (38,'ATT_3', 'val3',8);
INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (39,'ATT_4', 'val4',8);
INSERT INTO instance_attribute(id, key, value, instance_id) VALUES (40,'ATT_5', 'val5',8);

INSERT INTO configuration(id, organization_id, controller) values (1, '24tr1q3w', 'AWS');
INSERT INTO configuration(id, organization_id, controller) values (2, '24tr1q3w', 'VMWARE');
INSERT INTO configuration(id, organization_id, controller) values (3, '24tr1q3w', 'OPENSTACK');
INSERT INTO configuration(id, organization_id, controller) values (4, '24tr1q3w', 'AZURE');

INSERT INTO configuration(id, organization_id, controller) values (5, 'rg563ebc', 'AWS');
INSERT INTO configuration(id, organization_id, controller) values (6, 'rg563ebc', 'VMWARE');
INSERT INTO configuration(id, organization_id, controller) values (7, 'rg563ebc', 'OPENSTACK');
INSERT INTO configuration(id, organization_id, controller) values (8, 'rg563ebc', 'AZURE');