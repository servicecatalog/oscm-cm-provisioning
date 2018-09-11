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

INSERT INTO instance_parameter(key, value, instance_id) VALUES ('TENANT_ID', '42eewff33esgsdfaad',1);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('TP_IMAGEID', 'cedarish',1);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('TP_FLAVOuR', 'm1.small',1);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('TP_AZ', 'nova',1);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('TP_VMNAME', 'VM-os1234434322',1);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('TP_KEYNAME', 'openstackkeypair',1);

INSERT INTO instance_parameter(key, value, instance_id) VALUES ('TENANT_ID', '3445edfdfff4f4ff4f',2);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('TP_IMAGEID', 'cedarish',2);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('TP_FLAVOuR', 'm1.medium',2);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('TP_AZ', 'cinder',2);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('TP_VMNAME', 'VM-433dsdfdsf33',2);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('TP_KEYNAME', 'openstackkeypair',2);

INSERT INTO instance_parameter(key, value, instance_id) VALUES ('INSTANCENAME', '3445edfdfff4f4ff4f',4);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('INSTANCENAME_PREFIX', 'aws',4);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('KEY_PAIR_NAME', 'abc:123',4);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('IMAGE_NAME', 'ami-0d77397e',4);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('INSTANCE_TYPE', 't2.micro',4);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('REGION', 'us-west-1',4);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('DISK_SIZE', '3',4);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('PUBLIC_IP', '10.10.0.1',4);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('SUBNET', 'subnet-a77430d0',4);

INSERT INTO instance_parameter(key, value, instance_id) VALUES ('AMOUNT_OF_RAM', '4 GB',6);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('DISK_SIZE', '100',6);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('IMPORT_EXISTING_VM', 'false',6);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('INSTANCENAME', 'vmware1313131',6);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('DOMAIN_NAME', 'private',6);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('NIC1_NETWORK_SETTINGS', 'DHCP',6);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('NUMBER_OF_NICS', '1',6);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('TEMPLATENAME', 'SUSE 11',6);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('TARGET_CLUSTER', 'esscluster',6);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('TARGET_DATACENTER', 'EST',6);

INSERT INTO instance_parameter(key, value, instance_id) VALUES ('REGION', 'eu',7);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('CLIENT_SECRET', 'admin123',7);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('STORAGE_ACCOUNT', 'ac13122',7);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('VM_NAME', 'azure78-099932',7);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('TEMPLATE_PARAMETERS_NAME', 'params.xml',7);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('SUBNET', '192.168.1.11',7);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('RESOURCE_GROUP_NAME', 'res1234',7);

INSERT INTO instance_parameter(key, value, instance_id) VALUES ('REGION', 'us',3);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('CLIENT_SECRET', 'qwerty123456',3);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('STORAGE_ACCOUNT', 'ac3333',3);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('VM_NAME', 'azure21-9999',3);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('TEMPLATE_PARAMETERS_NAME', 'params.xml',3);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('SUBNET', '192.168.18.101',3);
INSERT INTO instance_parameter(key, value, instance_id) VALUES ('RESOURCE_GROUP_NAME', 'res3334',3);

INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_1', 'val1',1);
INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_2', 'val2',1);
INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_3', 'val3',1);
INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_4', 'val4',1);
INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_5', 'val5',1);

INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_1', 'val1',2);
INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_2', 'val2',2);
INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_3', 'val3',2);
INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_4', 'val4',2);
INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_5', 'val5',2);

INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_1', 'val1',3);
INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_2', 'val2',3);
INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_3', 'val3',3);
INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_4', 'val4',3);
INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_5', 'val5',3);

INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_1', 'val1',4);
INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_2', 'val2',4);
INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_3', 'val3',4);
INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_4', 'val4',4);
INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_5', 'val5',4);

INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_1', 'val1',5);
INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_2', 'val2',5);
INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_3', 'val3',5);
INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_4', 'val4',5);
INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_5', 'val5',5);

INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_1', 'val1',6);
INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_2', 'val2',6);
INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_3', 'val3',6);
INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_4', 'val4',6);
INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_5', 'val5',6);

INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_1', 'val1',7);
INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_2', 'val2',7);
INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_3', 'val3',7);
INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_4', 'val4',7);
INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_5', 'val5',7);

INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_1', 'val1',8);
INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_2', 'val2',8);
INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_3', 'val3',8);
INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_4', 'val4',8);
INSERT INTO instance_attribute(key, value, instance_id) VALUES ('ATT_5', 'val5',8);

INSERT INTO configuration(id, organization_id, controller) values (1, '24tr1q3w', 'AWS');
INSERT INTO configuration(id, organization_id, controller) values (2, '24tr1q3w', 'VMWARE');
INSERT INTO configuration(id, organization_id, controller) values (3, '24tr1q3w', 'OPENSTACK');
INSERT INTO configuration(id, organization_id, controller) values (4, '24tr1q3w', 'AZURE');

INSERT INTO configuration(id, organization_id, controller) values (5, 'rg563ebc', 'AWS');
INSERT INTO configuration(id, organization_id, controller) values (6, 'rg563ebc', 'VMWARE');
INSERT INTO configuration(id, organization_id, controller) values (7, 'rg563ebc', 'OPENSTACK');
INSERT INTO configuration(id, organization_id, controller) values (8, 'rg563ebc', 'AZURE');

INSERT INTO configuration_setting(key, value, configuration_id) VALUES ('AWS_URL', 'http://example.com',1);
INSERT INTO configuration_setting(key, value, configuration_id) VALUES ('AWS_USER', 'admin',1);
INSERT INTO configuration_setting(key, value, configuration_id) VALUES ('AWS_PWD', 'adminadmin',1);
INSERT INTO configuration_setting(key, value, configuration_id) VALUES ('AWS_DEFAULT_TENANT', 'publicaws',1);

INSERT INTO configuration_setting(key, value, configuration_id) VALUES ('VMWARE_API', 'http://test.vmware.com',2);
INSERT INTO configuration_setting(key, value, configuration_id) VALUES ('VMWARE_USER', 'vmwareadmin',2);
INSERT INTO configuration_setting(key, value, configuration_id) VALUES ('VMWARE_PWD', 'qwerty123',2);
INSERT INTO configuration_setting(key, value, configuration_id) VALUES ('VMWARE_SETT1', 'test123',2);

INSERT INTO configuration_setting(key, value, configuration_id) VALUES ('OS_URL_API', 'http://devstack.local',3);
INSERT INTO configuration_setting(key, value, configuration_id) VALUES ('OS_USER', 'administrator',3);
INSERT INTO configuration_setting(key, value, configuration_id) VALUES ('OS_PWD', 'admin',3);
INSERT INTO configuration_setting(key, value, configuration_id) VALUES ('OS_SETT1', 'val124444',3);

INSERT INTO configuration_setting(key, value, configuration_id) VALUES ('AZ_ENDPOINT', 'http://azure.cloud:8080',4);
INSERT INTO configuration_setting(key, value, configuration_id) VALUES ('AZ_USER', 'tester',4);
INSERT INTO configuration_setting(key, value, configuration_id) VALUES ('AZ_PWD', 'tester',4);
INSERT INTO configuration_setting(key, value, configuration_id) VALUES ('AZ_SETT1', 'setval1',4);

INSERT INTO configuration_setting(key, value, configuration_id) VALUES ('AWS_URL', 'http://aws.com',5);
INSERT INTO configuration_setting(key, value, configuration_id) VALUES ('AWS_USER', 'administrator',5);
INSERT INTO configuration_setting(key, value, configuration_id) VALUES ('AWS_PWD', 'admin123',5);
INSERT INTO configuration_setting(key, value, configuration_id) VALUES ('AWS_DEFAULT_TENANT', 'publicaws',5);

INSERT INTO configuration_setting(key, value, configuration_id) VALUES ('VMWARE_API', 'http://vmware.local',6);
INSERT INTO configuration_setting(key, value, configuration_id) VALUES ('VMWARE_USER', 'vmwareadmin',6);
INSERT INTO configuration_setting(key, value, configuration_id) VALUES ('VMWARE_PWD', 'qwerty123',6);
INSERT INTO configuration_setting(key, value, configuration_id) VALUES ('VMWARE_SETT1', 'val1111111',6);

INSERT INTO configuration_setting(key, value, configuration_id) VALUES ('OS_URL_API', 'http://soc.test.com',7);
INSERT INTO configuration_setting(key, value, configuration_id) VALUES ('OS_USER', 'administrator',7);
INSERT INTO configuration_setting(key, value, configuration_id) VALUES ('OS_PWD', 'admin',7);
INSERT INTO configuration_setting(key, value, configuration_id) VALUES ('OS_SETT1', 'sett1111111',7);

INSERT INTO configuration_setting(key, value, configuration_id) VALUES ('AZ_ENDPOINT', 'http://cloudazure.com',8);
INSERT INTO configuration_setting(key, value, configuration_id) VALUES ('AZ_USER', 'admin',8);
INSERT INTO configuration_setting(key, value, configuration_id) VALUES ('AZ_PWD', 'admin123123',8);
INSERT INTO configuration_setting(key, value, configuration_id) VALUES ('AZ_SETT1', 'val1',8);