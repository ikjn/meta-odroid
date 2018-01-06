FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "4.9.75"
KBRANCH ?= "linux-4.9.y"
SRCREV ?= "9f74755895f9b080f79384edb600a18433788adc"

require linux-stable.inc

COMPATIBLE_MACHINE = "(odroid-xu3|odroid-xu4|odroid-xu3-lite|odroid-xu4s)"
