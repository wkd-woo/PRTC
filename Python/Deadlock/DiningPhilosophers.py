import threading
import time

class Philosopher(threading.Thread):
    running = True

    def __init__(self, index, left, right):
        super(Philosopher, self).__init__()
        self.index = index
        self.leftFork = threading.Semaphore(1)
        self.rightFork = threading.Semaphore(1)

    def run(self):
        while self.running:
            time.sleep(10)
            print('철학자 %d는 기다리고 있다.' % self.index)
            self.dine()

    def dine(self):
        fork1, fork2 = self.leftFork, self.rightFork
        while self.running:
            fork1.acquire()
            locked = fork2.acquire(False)

            if locked: break
            fork1.release()
            print('철학자 %d는 포크를 바꿔 쥔다.' % self.index)
            folk1, folk2 = folk2, folk1
        else:
            return
        self.dining()
        # 식사를 마치고 포크를 모두 내려놓음
        fork2.release()
        fork1.release()
        
    def dining(self):
        print('철학자 %d는 식사를 시작한다. ' % self.index)
        time.sleep(30)
        print('철학자 %d는 식사를 마치고 포크를 내려 놓는다. ' % self.index)


def main():
    forks = [threading.Semaphore() for n in range(5)]

    philosophers = [Philosopher(i+1, forks[i % 5], forks[(i + 1) % 5]) for i in range(5)]

    Philosopher.running = True
    for p in philosophers: p.start()
    time.sleep(100)
    Philosopher.running = False
    print("끝")


if __name__ == "__main__":
    main()