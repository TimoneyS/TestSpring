DROP TABLE IF EXISTS `n_user`;
CREATE TABLE `n_user` (
   `user_id`        INT UNSIGNED NOT NULL,
   `real_name`      VARCHAR(100) NOT NULL,
   `username`       VARCHAR(100) NOT NULL,
   `password`       VARCHAR(100) NOT NULL,
   `user_job`       VARCHAR(100) NOT NULL,
   `user_title`     VARCHAR(500) NOT NULL,
   `create_date`    DATETIME DEFAULT NOW(),
   PRIMARY KEY ( `user_id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `question`;
CREATE TABLE `question` (
   `question_id`        INT UNSIGNED NOT NULL,
   `question_title`     VARCHAR(100) NOT NULL,
   `question_content`   VARCHAR(500) NOT NULL,
   `author_id`          INT UNSIGNED NOT NULL,
   `create_date`        DATETIME DEFAULT NOW(),
   PRIMARY KEY ( `question_id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `answer`;
CREATE TABLE `answer` (
   `answer_id`          INT UNSIGNED  NOT NULL,
   `answer_content`     VARCHAR(5000) NOT NULL,
   `author_id`          INT UNSIGNED  NOT NULL,
   `parent_id`          INT UNSIGNED  NOT NULL,
   `create_date`        DATETIME DEFAULT NOW(),
   PRIMARY KEY ( `answer_id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- 添加约束
ALTER TABLE `question` ADD CONSTRAINT `question_author_id_user_id` FOREIGN KEY (`author_id`)
REFERENCES N_USER(`user_id`) 
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE `answer` ADD CONSTRAINT `answer_parent_id_quetion_id` FOREIGN KEY (`parent_id`)
REFERENCES question(`question_id`) 
ON DELETE NO ACTION
ON UPDATE NO ACTION;

-- 用户序列初始化
INSERT INTO sequence VALUES ('N_USER_SEQ', 0, 1);
SELECT SETVAL('N_USER_SEQ', 10000);

-- 问题序列
INSERT INTO sequence VALUES ('N_QUES_SEQ', 0, 1);

-- 插入默认用户
insert into n_user(user_id, real_name, username, password, user_job, user_title)
    SELECT NEXTVAL('N_USER_SEQ'),
    '管理员',
    'admin',
    'root',
    '管理员',
    '一个普通的管理员'
;


