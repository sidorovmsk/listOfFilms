package testgroup.filmography.model;

import javax.persistence.*;

@Entity // указывает на то, что данный класс является сущностью.
@Table(name = "films") // указывает на конкретную таблицу для отображения этой сущности.
public class Film {

    @Id // указывает, что данное поле является первичным ключом, т.е. это свойство будет использоваться для идентификации каждой уникальной записи.
    @Column(name = "id") // связывает поле со столбцом таблицы. Если имена поля и столбца таблицы совпадают, можно не указывать.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // свойство будет генерироваться автоматически, в скобках можно указать каким образом.
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "year")
    private int year;

    @Column(name = "genre")
    private String genre;

    @Column(name = "watched")
    private boolean watched;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getId() + " " + getTitle() + " " + getYear()
                + " " + getGenre() + " " + isWatched());
        return stringBuilder.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isWatched() {
        return watched;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }
}
