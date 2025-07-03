def solution(targets):
    answer = 0
    # target 리스트의 값 두번째 값을 우선적으로 정렬, 비교하는 두번째 값이 같으면 첫번째 값을 비교 진행하며 정렬
    targets.sort(key = lambda x:[x[1],x[0]])
    end = 0
    
    for target in targets:
        if (end <= target[0]):
            answer += 1
            end = target[1]
    return answer