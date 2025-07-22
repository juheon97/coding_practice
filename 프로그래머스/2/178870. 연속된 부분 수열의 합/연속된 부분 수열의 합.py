def solution(sequence, k):
    # 인데스 시작점과 끝점
    s = 0
    e = 0
    # 시작점과 끝점을  넣기
    answer = [0, len(sequence)]
    
    # 각 값의 함은 start에서 시작
    sum = sequence[0]
    
    while True:
        
        if sum < k:
            e += 1
            # while문 종류 조건
            if e == len(sequence):
                break
            sum += sequence[e]
            
        else:
            
            if sum == k:
                if e - s < answer[1] - answer[0]:
                    answer = [s,e]
                    
            # 합이 k이상인 경우는 start를 땡기며 합을 빼줌
            sum -= sequence[s]
            s += 1
            
    return answer