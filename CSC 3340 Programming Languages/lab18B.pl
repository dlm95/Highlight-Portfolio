/*
 * The followoung rules triple each element in a given list.
 * The recursive case writes three copies of the head of the input list as head elements of the output list and then continue this process with the tail of the list.
 * The base case: stop when you reach an empty input list with empty list as an output.
 */

triple([], []).
triple([X | Xs], [X, X, X | Ys]) :- triple(Xs, Ys).


% Determines the number of atoms present in a given list.
 
numb_atoms([], 0).
numb_atoms([X|Xs], N) :- atom(X), numb_atoms(Xs, M), N is M + 1.
numb_atoms([X|Xs], N) :- not(atom(X)), numb_atoms(Xs, N).


% Determines the number of times an element occurs in a given list.

count_El(El, [], 0).
count_El(El, [El|Xs], N) :- count_El(El, Xs, M), N is M + 1.
count_El(El, [X|Xs], N) :- X \= El, count_El(El, Xs, N).

