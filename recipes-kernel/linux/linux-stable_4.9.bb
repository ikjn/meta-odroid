FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "4.9.70"
KBRANCH ?= "linux-4.9.y"
SRCREV ?= "ee52d08d2e09539154f397c8a412c68189c4d6a0"

require linux-stable.inc

COMPATIBLE_MACHINE = "(odroid-xu3|odroid-xu4|odroid-xu3-lite|odroid-xu4s)"
