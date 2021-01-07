DROP TABLE IF EXISTS owners;
CREATE TABLE `teams` (
                         `id` int(11) NOT NULL,
                         `active_since` date DEFAULT NULL,
                         `active_status` bit(1) NOT NULL,
                         `team_name` varchar(255) DEFAULT NULL,
                         `owber_id` int(11) DEFAULT NULL,
                         PRIMARY KEY (`id`),
                         KEY `FKkxd8qltxw1s27xboklqel5vbc` (`owber_id`),
                         CONSTRAINT `FKkxd8qltxw1s27xboklqel5vbc` FOREIGN KEY (`owber_id`) REFERENCES `owners` (`id`)
);