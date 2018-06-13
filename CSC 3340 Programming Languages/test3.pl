mother(sheryl, derrick).
mother(sheryl, sherell).
mother(sheryl, derjuan).
father(derricksr, derrick).
father(derricksr, sherell).
father(derricksr, derjuan).  
male(derricksr).
male(derrick).
female(sheryl).
female(sherell).

mother(sherell,danny).
male(danny.)


% X is a parent of Y if X is the father of Y.
parent(X, Y) :- father(X, Y).

% X is a parent of Y if X is the mother of Y.
parent(X, Y) :- mother(X, Y).

% X and Y are siblings if they have the same parent P.
sibling(X, Y) :- parent(P, X), parent(P, Y), X \= Y.
% X is a brother of Y if X is a male sibling of Y
brother(X, Y) :- sibling(X, Y), male(X).


% X is a grandson of Y if Y is  a parent of one of X's parents and X is a male.
grandson(X, Y) :- parent(Y, Z), parent(Z, X), male(X).

% X is a first cousin of Y if some parent  P1 of X and some parent P2 of Y are siblings.
first_cousin(X,Y):- parent(P1,X), parent(P2,Y), sibling(P1,P2),  X \= Y.

% X is the nephew of Y
nephew(X, P) :- siblings(A,Z),
	parent(P1,X), parent(P2,Y).
	
	
% Problem2

count9_21([], 0). 
count9_21([X|Xs], Z):- 
X > 9, 
X < 21,
count9_21(Xs, Z1), 
Z is 1 + Z1. 
count9_21([_|Xs], Z) :- count9_21(Xs, Z). 

id(1, 'Daryle Smith').
id(2, 'Amos Baker').
id(3, 'Gurpreet Dhillon').
id(4, 'John Myers')
id(5, 'Edward Jordan').

transform([names|names], [id|id]) :- transform(names, id),  			transform(names, id).transform([],[]).

flight(a,b).
flight(b,c).
fligt(c,d).
flight(p,q).
flight(q,r).

flight :- 

