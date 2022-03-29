import pygame
import sys
class character():
    def __init__(self,screen):
        self.screen = screen

        self.image = pygame.image.load("Project12\images\wjm.bmp")
        self.rect = self.image.get_rect()
        self.screen_rect = screen.get_rect()

        self.rect.centerx = self.screen_rect.centerx
        self.rect.bottom = self.screen_rect.bottom

    def blitme(self):
        self.screen.blit(self.image, self.rect)
def back():
    pygame.init()
    screen = pygame.display.set_mode((1200,800))
    pygame.display.set_caption('Blue Background')
    bg_color = (0,0,255)
    char = character(screen)
    while True:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                sys.exit()

        char.blitme()
        screen.fill(bg_color)
        pygame.display.flip()

back()