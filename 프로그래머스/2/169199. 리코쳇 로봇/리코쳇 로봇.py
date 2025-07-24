from collections import deque

dx = [1,0,-1,0]
dy = [0,1,0,-1]

                

def solution(board):
    
    answer = 0
    
    w = len(board[0])
    h = len(board)
    
    deq = deque()
    
    visited = [[float('inf')] * w for _ in range(h)]
    
    # 시작점 찾기
    
    for i in range(h):
        for j in range(w):
            if board[i][j] == "R":
                deq.append((i,j, 0))
        if deq:
            break
    
    while deq:
        ci, cj, cc = deq.popleft()
        
        if board[ci][cj] == "G":
            answer = cc

        
        for i in range(4):
            ni, nj = ci, cj
            
            while  0 <= ni + dx[i] < h and 0 <= nj + dy[i] < w and board[ni+dx[i]][nj+dy[i]] != "D":
                ni += dx[i]
                nj += dy[i]
            
            if visited[ni][nj] > cc + 1:
                visited[ni][nj] = cc + 1
                deq.append((ni,nj, cc+1))
    
    if answer == 0:
        answer = -1
    
    return answer