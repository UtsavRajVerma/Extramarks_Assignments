# @TODO -> Required User Table
# @TODO -> Required Theater Table
# @TODO -> Required Screen Table

CREATE TABLE User (
     id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
     userName VARCHAR(128) NOT NULL UNIQUE,
     gender VARCHAR(20) NOT NULL,
     emailAddr VARCHAR(255) NOT NULL UNIQUE,
     password VARCHAR(1024) NOT NULL,
     createdAt DATETIME DEFAULT CURRENT_TIMESTAMP,
     birthDate DATE,
     phoneNo VARCHAR(15) NOT NULL UNIQUE
);

CREATE TABLE theater (
  theaterId INT PRIMARY KEY AUTO_INCREMENT,
  phoneNumber varchar(15),
  postalCode varchar(10),
  streetAddress varchar(512),
  city varchar(100),
  district varchar(100),
  state varchar(100)
);

CREATE TABLE screen (
    theaterId INT,
    screenId INT,
    capacity INT,
    PRIMARY KEY (theaterId, screenId),
    FOREIGN KEY(theaterId) REFERENCES theater(theaterId)
);

CREATE TABLE Movie(
      movieId INT UNSIGNED NOT NULL AUTO_INCREMENT,
      name VARCHAR(45) NOT NULL,
      ageRestriction INT NULL,
      rating INT UNSIGNED NULL,
      duration INT UNSIGNED NULL,
      releaseDate VARCHAR(45) NULL,
      PRIMARY KEY(movieId)
);


CREATE TABLE Castcrew(
     castCrewId INT NOT NULL AUTO_INCREMENT,
     name VARCHAR(45) NOT NULL,
     gender VARCHAR(45) BINARY NULL,
     PRIMARY KEY(castCrewId)
);

CREATE TABLE MovieCastCrew(
      movieId INT UNSIGNED NOT NULL,
      castCrewId INT NOT NULL,

      PRIMARY KEY(movieId, castCrewId),
      INDEX castCrewId_idx ( castCrewId ASC) INVISIBLE,
      INDEX movieId_idx (movieId ASC) INVISIBLE,

      CONSTRAINT movieId  FOREIGN KEY(movieId) REFERENCES Movie(movieId),
      CONSTRAINT castCrewId  FOREIGN KEY(castCrewId) REFERENCES Castcrew(castCrewId)
);

CREATE TABLE Language(
 languageId INT NOT NULL AUTO_INCREMENT,
 name VARCHAR(45) NOT NULL,
 PRIMARY KEY(languageId)
);

CREATE TABLE MovieLanguage(
  movieId INT NOT NULL AUTO_INCREMENT,
  languageId INT NOT NULL,
  PRIMARY KEY(movieId)
);

CREATE TABLE Genre(
  genreId INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(45) NOT NULL,
  PRIMARY KEY(genreId)
);

CREATE TABLE MovieGenre(
   movieId INT UNSIGNED NOT NULL,
   genreId INT NOT NULL,
   PRIMARY KEY(movieId, genreId)
);

CREATE TABLE Format(
   formatId INT NOT NULL AUTO_INCREMENT,
   name VARCHAR(45) NOT NULL,
   PRIMARY KEY(formatId)
);

CREATE TABLE MovieFormat(
    movieId INT UNSIGNED NOT NULL,
    formatId INT NOT NULL,
    PRIMARY KEY(movieId, formatId)
);


CREATE TABLE Show(
     showId INT UNSIGNED NOT NULL AUTO_INCREMENT,
     theatreId VARCHAR(45) NOT NULL,
     screenId INT UNSIGNED NOT NULL,
     movieId INT UNSIGNED NOT NULL AUTO_INCREMENT,
     language VARCHAR(45) NULL,
     display VARCHAR(45) NULL,
     state VARCHAR(45) NULL,
     city VARCHAR(45) NULL,
     statTime VARCHAR(45) NULL,
     endTime VARCHAR(45) NULL,
     seatLeft INT UNSIGNED NULL,
     bookingStatus VARCHAR(45) BINARY NULL,
     PRIMARY KEY(movieId)
);


CREATE TABLE Seat(
     seatId INT UNSIGNED NOT NULL AUTO_INCREMENT,
     screenId INT UNSIGNED NOT NULL,
     rowId INT UNSIGNED NOT NULL,
     columnId INT UNSIGNED NOT NULL,
     status VARCHAR(45) BINARY NULL,
     price INT UNSIGNED NOT NULL,
     PRIMARY KEY(seatId)
);

Create table Booking(
    bookingId INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    userId VARCHAR(40),
    screenId INT UNSIGNED NOT NULL,
    showId INT UNSIGNED NOT NULL,
    cinemaId VARCHAR(40),
    bookedAt TIMESTAMP,
    seats INT UNSIGNED NULL,
    discount INT UNSIGNED NULL,
    tax INT UNSIGNED NOT NULL,
    totalPrice INT UNSIGNED NOT NULL,
    status VARCHAR(40)
);

CREATE TABLE SeatMapping(
    seatId INT UNSIGNED NOT NULL,
    bookingId INT UNSIGNED NOT NULL,
    PRIMARY KEY(seatId, bookingId),
    FOREIGN KEY (seatId) REFERENCES Seat(seatId),
    FOREIGN KEY (bookingId) REFERENCES Booking(bookingId)
);

CREATE TABLE Transaction(
        transactionID INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
        bookingId INT UNSIGNED NOT NULL,
        modeOfPayment VARCHAR(20) NOT NULL,
        gateWayRespKey VARCHAR(40),
        FOREIGN KEY (bookingId) REFERENCES Booking(bookingId)
);

create table Feedback(
     feedbackId INT UNSIGNED NOT NULL AUTO_INCREMENT,
     userId INT UNSIGNED NOT NULL,
     createdDate DATETIME DEFAULT CURRENT_TIMESTAMP,
     queryType Varchar(255),
     comment Varchar(255),
     answer Varchar(255),
     status BOOLEAN NOT NULL DEFAULT 0,
     PRIMARY KEY (feedbackId)
);