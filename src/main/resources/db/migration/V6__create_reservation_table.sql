CREATE TABLE IF NOT EXISTS reservation (
    id INT(10) UNSIGNED UNIQUE NOT NULL AUTO_INCREMENT,
    room_type_id INT(10) UNSIGNED NOT NULL,
    customer_id INT(10) UNSIGNED NOT NULL,
    quantity INT(10) UNSIGNED NOT NULL,
    start_date BIGINT UNSIGNED NOT NULL,
    end_date BIGINT UNSIGNED NOT NULL,
    cancelled BOOLEAN NOT NULL DEFAULT FALSE,
    created_at BIGINT UNSIGNED NOT NULL,
    updated_at BIGINT UNSIGNED NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (room_id) REFERENCES room(id) ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY (customer_id) REFERENCES customer(id) ON UPDATE CASCADE ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;