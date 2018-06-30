prereq(introCS,dataStructs). 
prereq(dataStructs,progLangs). 
prereq(dataStructs,graphics). 
prereq(linAlg,graphics). 

isa(lupo,wolf).
isa(foxy,fox).
isa(bunny,rabbit).
isa(slimey,snail).
isa(tweety,bird).
eats(tweety,corn).
eats(bunny,corn).

parent(Child,P) :- father(Child,P).
parent(Child,P) :- mother(Child, P).

father(derrickII, derrick).
mother(derrickII, sheryl).
father(derjuan, derrick).
mother(sherell, sheryl).
female(sheryl).
female(sherell).
male(derrick).
male(derrickII).
