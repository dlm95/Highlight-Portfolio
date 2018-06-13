adjacent(X,Y,[X,Y|Zs]).
adjacent(X,Y,[Z|Zs]):-adjacent(X,Y,Zs).
% adjacent(3,4,[1,2,3,4,5,6,7]).

factorial(0, 1).
factorial(N, NF) :- M is N-1, 
                   factorial(M, MF),
                   NF is N * MF.

				   sum(0,0).
				   
sum([], 0).
sum([X|Xs], N) :- number(X), 
          sum(Xs, M), N is M + X.

sum(0,0).
sum(N,S):- N1=N-1,
           sum(N1,S1),
           S=S1+N.
%  sum([1,2,3,4,5,6],L).

sum([], 0).
sum([X|Xs], N) :- number(X), 
            sum(Xs, M), N is M + X.
sum([X|Xs], N) :- not(number(X)), 
            sum(Xs, N).


sum_po([], 0).
sum_po([X|Xs], N) :- X>0, 
       sum_po(Xs, M), N is M + X.
sum_po([X|Xs]):-X<0,sum_po(N,Xs).

