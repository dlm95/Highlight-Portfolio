

mother(deborah, lance).
mother(deborah, rebekah).
mother(deborah, andrew).
father(larry, lance).
father(larry, rebekah).
father(larry, andrew).  
mother(sherly,deborah).
mother(elma,larry).
mother(elma,lisa).
mother(lisa,cody).
father(bob, deborah).
father(ralph, larry).
father(dave,cody).
male(dave).
male(ralph).
male(bob).
male(cody).
female(sherly).
female(lisa).
female(elma).
male(lance).
male(andrew).
male(larry).
female(deborah).
female(rebekah).

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


						
on(b,a). 
on(c,b).
on(d,c).				

above(B2,B1) :- on(B2,B1). 
above(B2,B1) :- on(B3,B1) , above(B3,B1).
adjecent
		
		

len([], 0).
len([X|Xs], Length) :- len(Xs, L), Length is L + 1.


						
						