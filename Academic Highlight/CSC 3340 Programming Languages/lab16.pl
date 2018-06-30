eligible(P,W):- 
	age(P, A),
	A >= 21.
	
	
age(brian, 18).
age(whitney, 23).
age(james, 22).
age(lyssa, 21).
age(lance, 27).
age(brooke, 25).

under5k(M):-
	has(_, car(M,_,C)),
	C < 5000.

has(jason, car(nissan,2,5750)).
has(aaron, car(ford,5,6200)).
has(whitney, car(toyota,9,2000)).
has(lance, car(mazda,4,4500)).
has(noelle, car(hyundai,11,2800)).
has(brian, car(ford,2,6000)).
has(tiffany, car(chevrolet,5,7000)).
has(lyssa, car(toyota,3,9000)).


samecity(L,F,B,A,C):-
	person_data(name(L,F), date_of_birth(_,_,_), contact_info(address(_,C), tel(_), email(_))),
	person_data(name(B,A), date_of_birth(_,_,_), contact_info(address(_,C), tel(_), email(_))),
	F\=A,
	L\=B.
	
older29(F,L):-
	person_data(name(L,F), date_of_birth(_,_,Y), contact_info(address(_,_), tel(_), email(_))),
	T is 2016 - Y,
	T>29.
	
lastsmith(F) :-
	person_data(name('Smith',F), date_of_birth(_,_,_), contact_info(address(_,_), tel(_), email(_))).


person_data(name('Smith', 'John'), date_of_birth(28, feb, 1973),  
  contact_info(address('2615 Amesbury Rd', 'Winston Salem'), 
      tel(7652478), email('smithj@wssu.edu'))).
person_data(name('Anderson', 'Adam'), date_of_birth(1, jan, 1990),  
  contact_info(address('5555 Anesburg Rd', 'Kernersville'), 
      tel(7642131), email('andersona@wssu.edu'))).
person_data(name('Smith', 'Ben'), date_of_birth(2, march, 1995),  
  contact_info(address('1111 Bernie St', 'Kernersville'), 
      tel(7644586), email('smithj@wssu.edu'))).
person_data(name('Thomas', 'Sam'), date_of_birth(3, jun, 1950),  
  contact_info(address('642 Frank Pl', 'Winston Salem'), 
      tel(753653), email('smiths@wssu.edu'))).

