triple([],0).
triple([X|Xs],Ys):-
	X,
	X is J,
	append[X,J,Ys].
	
numb_atoms([],0).
numb_atoms([X|Xs], N) :- number(X),
	numb_atoms(Xs, N).
numb_atoms([X|Xs], N) :- not(number(X)),
	numb_atoms(Xs, C), N is C + 1.
	
count_E1(E1,[],0).
count_E1(E1,[X|Xs],N) :- E1 \= X,
	count_E1(E1,Xs,N).
count_E1(E1,[X|Xs], N) :- 
	E1 = X, count_E1(E1, Xs, C), N is C + 1.


	
