import pygame
import sys
def back():
    pygame.init()
    screen = pygame.display.set_mode((800,400))
    pygame.display.set_caption('Blue Background')
    bg_color = (0,0,255)
    while True:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                sys.exit()
    
        screen.fill(bg_color)
        pygame.display.flip()

back()