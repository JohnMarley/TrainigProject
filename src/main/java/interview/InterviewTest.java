package interview;

import java.util.*;
import java.util.stream.Collectors;

//Input: Home Library. Imagine we have home library with books by different authors.Task 1: Find books with pageCount>100.
//    Task 2: Find our favorite authors. [Authors whose books amount is maximum in our home library].
public class InterviewTest {

public static class Book {
        private String name;
        private Date creationDate;
        private int pageCount;
        private List<Author> authorList;

        public Book(String name, Date creationDate, int pageCount, List<Author> authorList) {
            this.name = name;
            this.creationDate = creationDate;
            this.authorList = authorList;
            this.pageCount = pageCount;
        } public String getName() {
            return name;
        } public void setName(String name) {
            this.name = name;
        } public Date getCreationDate() {
            return creationDate;
        } public void setCreationDate(Date creationDate) {
            this.creationDate = creationDate;
        } public List<Author> getAuthorList() {
            return authorList;
        } public void setAuthorList(List<Author> authorList) {
            this.authorList = authorList;
        }
        public int getPageCount() {
            return pageCount;
        } public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

}
public class Library {
        private List<Book> bookList; public Library (List<Book> bookList) {
            this.bookList = bookList;
        } public List<Book> getBookList() {
            return bookList;
        } public void setBookList(List<Book> bookList) {
            this.bookList = bookList;
        }
    }
    public static void main (String[] args){
//Task 1: Find books with pageCount>100.
//Task 2: Find our favorite authors. [Authors whose books amount is maximum in our home library].
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("AAA",new Date(),20,List.of(new Author("ABC"),new Author("LL"))));
        bookList.add(new Book("BBB",new Date(),80,List.of(new Author("DF"),new Author("ABC"))));
        bookList.add(new Book("CCC",new Date(),150,List.of(new Author("LL"))));

        getFavoriteAuthor(bookList);
    }
    //Task 1
    public static List<Book> bookSortByPageCount(List<Book> bookList){
        return bookList
                .stream()
                .filter(book -> book.getPageCount() > 100)
                .collect(Collectors.toList());
    }

    // variant #1
    public static List<String> getFavoriteAuthor(List<Book> bookList){
        Map<String, Integer> map = new HashMap<>();
        for (Book book :
                bookList) {
            book.getAuthorList().forEach(author -> {
                String authorName = author.getFullName();
                if(map.get(authorName)!= null){
                    Integer count = map.get(authorName) +1;
                    map.put(authorName, count);
                } else {
                    map.put(authorName, 1);
                }
            });
        }

        List<Integer> temp = new ArrayList<>(map.values());
        int max = Collections.max(temp);

        return map.entrySet().stream()
                .filter(author -> author.getValue() == max)
                .map(author -> author.getKey())
                .collect(Collectors.toList());
    }

    // variant #2
    public static List<String> getFavoriteAuthorVariant2(List<Book> bookList){
        Map<String, Integer> map = new HashMap<>();
        for (Book book :
                bookList) {
            book.getAuthorList().forEach(author -> {
                map.merge(author.getFullName(), 1, Integer::sum);
            });
        }

        List<Integer> temp = new ArrayList<>(map.values());
        int max = Collections.max(temp);

        return map.entrySet().stream()
                .filter(author -> author.getValue() == max)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }


    public void task3() {
        List<Integer> list = List.of(0, 8, 2, 5, 1, 8, 15);

        LinkedHashSet<Object> list1 = list.stream()
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        System.out.println(list1);

    }

}
