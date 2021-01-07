DROP TABLE IF EXISTS owners;
CREATE TABLE `owners` (
                          `id` int(11) NOT NULL,
                          `active_since` datetime(6) DEFAULT NULL,
                          `active_status` bit(1) NOT NULL,
                          `owner_name` varchar(255) DEFAULT NULL,
                          `team_id` int(11) DEFAULT NULL,
                          PRIMARY KEY (`id`),
                          KEY `FKf6h8obcho859q91in4ny8u4x4` (`team_id`),
                          CONSTRAINT `FKf6h8obcho859q91in4ny8u4x4` FOREIGN KEY (`team_id`) REFERENCES `teams` (`id`)
);