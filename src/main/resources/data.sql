INSERT INTO APP_USER (name, email, enabled) VALUES ('Mike', 'mike.ehrmentraut@mail.com', true);

INSERT INTO LOCATION (name, capacity, latitude, longitude) VALUES ('Szeged', 20, 46.2530, 20.1414);

INSERT INTO BIKE (name, type, condition, hourly_cost, is_rented, location_id) VALUES ('Bike 1', 'trekking', 100, 5000, false, 1);
INSERT INTO BIKE (name, type, condition, hourly_cost, is_rented, location_id) VALUES ('Bike 2', 'mtb', 100, 6000, false, 1);
INSERT INTO BIKE (name, type, condition, hourly_cost, is_rented, location_id) VALUES ('Bike 3', 'city', 100, 4000, false, 1);