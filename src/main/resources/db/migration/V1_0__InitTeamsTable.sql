INSERT INTO teams  (id,active_since, active_status, team_name)
VALUES (1,'2010-09-01',1,'GimmydaLoot'),
       (2,'2010-09-01',1,'HogPit');

UPDATE teams t1
    INNER JOIN owners t2
ON t1.id = t2.team_id
    SET t1.owner_id = t2.id;
