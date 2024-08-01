package bob.simple.spring.presentation

import

@RequestMapping("/test")
@RestController
class TestController(
    private val carService: CarService,
) { 
    @GetMapping("/{id}"))
    fun getCar(
        @PathVariable id : String 
    ): CarResponseDto{
        return carService.getCar(id)
    }
}