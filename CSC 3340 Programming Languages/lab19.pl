partition([], [], []). 

partition([X|List],[X|Small],Large) :-
	X =< 10,
	partition(List, Small, Large).
	
partition([X|List], Small, [X|Large]) :-
	X > 10,
	partition(List, Small, Large).
	
	
insert(X, [], [X]).
insert(X, [Head|L1], [X,Head|L1]) :-
	X =< Head, 
	!.
insert(X, [Head|L1], [Head|L2]) :-
	insert(X,L1,L2).
	

last_el([X],X).
last_el([_|Tail],X) :- last_el(Tail,X).