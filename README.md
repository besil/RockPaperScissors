# RockPaperScissors
Rock Paper Scissor Java Game

QuickStart

'''
Player silvio = Player.newPlayer("silvio", Strategies.randomStrategy());
Player nemesi = Player.newPlayer("Nemesi", Strategies.randomStrategy());

Game g = new Game(silvio, nemesi);
g.play();

Player winner = g.winner();

printWinner(winner);
'''
