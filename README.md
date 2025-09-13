# artlib-cuda

:rotating_light: :rotating_light: :rotating_light: :rotating_light:
This has been moved to the [artlib monorepo](https://github.com/sdedovic/artlib)

</br>
</br>

A Clojure library for creating GPU accelerated computational artwork via CUDA. Heavily based on [uncomplicate/neanderthal](https://github.com/uncomplicate/neanderthal) and built on top of [uncomplicate/clojurecuda](https://github.com/uncomplicate/clojurecuda).

This is not published, yet. See also [artlib-core](https://github.com/sdedovic/artlib-core).

## Contents
### cuda
- **`cuda.curand`** - idiomatic wrapper around [cuRAND](https://developer.nvidia.com/curand) a la clojurecuda. 
- **`cuda.particles`** - wrapper around low-level particle simulation kernels, e.g. all-pairs charged particle simulation
