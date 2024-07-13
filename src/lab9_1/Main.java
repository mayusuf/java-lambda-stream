package lab9_1;

import dataaccess.DataAccess;
import dataaccess.DataAccessFacade;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		System.out.println(allWhoseZipContains3());
		System.out.println(allHavingOverdueBook());
		System.out.println(allHavingMultipleAuthors());

	}
	//Returns a list of all ids of LibraryMembers whose zipcode contains the digit 3
	public static List<String> allWhoseZipContains3() {
		DataAccess da = new DataAccessFacade();
		Collection<LibraryMember> members = Optional.ofNullable(da.readMemberMap())
				.map(HashMap::values)
				.orElseGet(ArrayList::new);

				//da.readMemberMap().values();
		return members.stream()
				.filter(member -> member.getAddress().getZip().contains("3"))
				.map(LibraryMember::getMemberId)
				.collect(Collectors.toList());

//		List<LibraryMember> mems = new ArrayList<>();
//		mems.addAll(members);
		//implement
//		return null;
		
	}
	//Returns a list of all ids of  LibraryMembers that have an overdue book
	public static List<String> allHavingOverdueBook() {

		DataAccess da = new DataAccessFacade();
		Collection<LibraryMember> members = Optional.ofNullable(da.readMemberMap())
				.map(HashMap::values)
				.orElseGet(ArrayList::new);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate currentDate = LocalDate.now();


		//da.readMemberMap().values();
		return members.stream()
				.filter(member->member.getCheckouts().stream()
						.anyMatch(mem -> {
							LocalDate dueDate = LocalDate.parse(mem.getDueDateAsString(), formatter);
							return dueDate.isBefore(currentDate);
						}))
				.map(LibraryMember::getMemberId)
				.collect(Collectors.toList());

//		List<LibraryMember> mems = new ArrayList<>();
//		mems.addAll(members);
		//implement
//		return null;
		
	}
	
	//Returns a list of all isbns of  Books that have multiple authors
	public static List<String> allHavingMultipleAuthors() {
		DataAccess da = new DataAccessFacade();
		// da.readBooksMap().values();
		Collection<Book> books = Optional.ofNullable(da.readBooksMap())
				.map(HashMap::values)
				.orElseGet(ArrayList::new);

		return books.stream()
				.filter(book -> book.getAuthors().size() > 1)
				.map(Book::getIsbn)
				.collect(Collectors.toList());

//		List<Book> bs = new ArrayList<>();
//		bs.addAll(books);
//		//implement
//		return null;
		
		}

}
