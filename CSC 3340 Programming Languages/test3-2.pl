% Problem 1

male(matthew).
male(elijah).
male(david).
male(john).

female(amy).
female(melissa).
female(gwynne).

father(matthew, david).
father(matthew, melissa).
father(john, elijah).
father(john, matthew).
mother(amy, david).
mother(amy, melissa).
mother(gwynne, elijah).
mother(gwynne, matthew).

parent(X, Y) :- father(X, Y).
parent(X, Y) :- mother(X, Y).

sibling(X, Y) :- parent(P, X), parent(P, Y), X \= Y.
niece(N, P) :- female(N), parent(P2, N), sibling(P2, P).


% Problem 2
zip(27110, 'Winston Salem').         
zip(27411, 'Greensboro').
zip(27284, 'Kernersville'). 
zip(27010, 'Bethania').      
zip(27021, 'King').


transform([], []).
transform([X|Xs], [Y|Cities]) :- zip(X, Y), transform(Xs, Cities).


% Problem 3

count9_21([], 0).
count9_21([X|Xs], N) :- X >9, X < 21,!, count9_21(Xs, M), N is M+1.
count9_21([X|Xs], N) :- count9_21(Xs, N).
%count9_21([X|Xs], N) :- X =< 9,  count9_21(Xs, N).
%count9_21([X|Xs], N) :- X >= 21,  count9_21(Xs, N).


% Extra credit problem
flight(a, b).
flight(b, c).
flight(c, d).
flight(p, q).
flight(q, r).

reachable(City1, City2) :- flight(City1, City2).
reachable(City1, City2) :- flight(City1, X),
			   reachable(X, City2).